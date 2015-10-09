# Logger
Simple logger for Android with support sections and json representation in the original form (only working with DEBUG logs)

<h3>Setup</h3>
Copy Logger class to your project and fix package 

<h3>Quick start:</h3>
```java
Logger.d("SampleActivity","Simple logs");
```	
![](https://cloud.githubusercontent.com/assets/5351890/10395451/b7ecade4-6ea5-11e5-8176-810c3845d13a.png)
```java	
Logger.dd("Simple section", "Simple log text");
```
![](https://cloud.githubusercontent.com/assets/5351890/10395472/dbe00db8-6ea5-11e5-8c67-0a71590eeade.png)
```java	
Logger.dd("Logs with json", "{"key1":"value1","key2":"value2","key3":"value3","key4":{"key5":"value5"}}");
```	
![](https://cloud.githubusercontent.com/assets/5351890/10395463/ce072910-6ea5-11e5-9c9c-f2893e8409ce.png)

<h3>Log's color</h3>

For change logs color: http://stackoverflow.com/questions/19933731/colored-logcat-in-android-studio-by-colorpid
	
License
--------

    Copyright 2015 A.Prayzner, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

