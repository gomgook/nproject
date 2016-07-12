package com.stewhouse.nproject.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Gomguk on 16. 7. 11..
 */
public class Channel {
    public static final String JSON_PARAM_ROOT = "channel";

    private static final String JSON_PARAM_TOTAL_COUNT = "totalCount";
    private static final String JSON_PARAM_ITEM = "item";

    private int mTotalCount = -1;
    private ArrayList<Item> mItems = null;

    public int getTotalCount() {
        return mTotalCount;
    }

    public ArrayList<Item> getItems() {
        return mItems;
    }

    public static Channel parseJSONObject(JSONObject jsonObject) {
        Channel channel = new Channel();

        try {
            if (jsonObject.has(JSON_PARAM_TOTAL_COUNT) == true) {
                String totalCountStr = (String) jsonObject.get(JSON_PARAM_TOTAL_COUNT);
                if (totalCountStr != null) {
                    channel.mTotalCount = (Integer.parseInt(totalCountStr));
                }
            }
            if (jsonObject.has(JSON_PARAM_ITEM) == true) {
                JSONArray items = jsonObject.getJSONArray(Item.JSON_PARAM_ROOT);
                if (items != null) {
                    channel.mItems = new ArrayList<Item>();
                    for (int i = 0; i < items.length(); i++) {
                        Item item = Item.parseJSONObject(items.getJSONObject(i));
                        channel.mItems.add(item);
                    }
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return channel;
    }
}