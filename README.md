# GRESTURLConnectionProject

GRESTURLConnectionProject is a project searching book list. It saves the keywords which recently searched and provides function to manage the keywords list.

GRESTURLConnectionProject is the test project to test a connection module which use REST API. Build.gradle which is dependent upon GRESTURLConnection module makes .lib file automatically and dependency of the file on app module to use this .lib file.

GRESTURLConnectionProject also includes using RecyclerView and Android DB managing. NBaseSearchAdapter and NBaseResultAdapter are the adapters of RecyclerView in the main view. NSQLiteOpenHelper includes the functions which is related to DB managing.

# GRESTURLConnection

GRESTURLConnection is the REST API connection module library. It provides HTTP & HTTPS connection. If you should use this library, import the .lib file which is the output of the build.gradle file.

GRESTURLConnection provides the functions below:

- HTTP & HTTPS connection
- Inputting REST API request types
- Setting connection parameters
- Setting connection timeout
- Setting connection headers
- Setting connection request bodies
- Getting connection result as String type to get all types of results
