# Logger
Simple logger for Android with support sections and json representation in the original form (only working with DEBUG logs)

<h3>Setup</h3>
Copy ```Logger.java``` from ```/code/``` folder	 to your project and fix package 

<h3>Quick start:</h3>

<h4>With tag and message</h4>

```java
Logger.d("SampleActivity","Simple logs");
```	
![](https://cloud.githubusercontent.com/assets/5351890/10395451/b7ecade4-6ea5-11e5-8176-810c3845d13a.png)
===
<h4>With section and message</h4>
In this case, first argument used for a section label
```java	
Logger.dd("Simple section", "Simple log text");
```
![](https://cloud.githubusercontent.com/assets/5351890/10395472/dbe00db8-6ea5-11e5-8c67-0a71590eeade.png)
===
<h4>With section and JSON</h4>
If message contains JSON syntax, that json be represent in the original form
```java	
Logger.dd("Logs with json", "{"key1":"value1","key2":"value2","key3":"value3","key4":{"key5":"value5"}}");
```	
![](https://cloud.githubusercontent.com/assets/5351890/10395463/ce072910-6ea5-11e5-9c9c-f2893e8409ce.png)
===
<h4>Without tag</h4>
In this case for first argument will be use class name that called <b>```Logger.d("test example 1")```</b> 
Log message start with called method's name as prefix
```java	
Logger.d("test example 1");
```
![](https://cloud.githubusercontent.com/assets/5351890/10400607/656fbdb4-6ec2-11e5-9f46-5e9b6754ac61.png)
	
<b>```intercept()```</b> - method were was called <b>```Logger.d("test example 1")```</b> from <b>```LoggerInterceptorImpl```</b> class

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

