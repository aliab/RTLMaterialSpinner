# MaterialSpinner

![Hero Image](https://raw.githubusercontent.com/aliab/circular-music-progressbar/master/art/splash.jpg)


RTl Material Spinner

This library provides you an RTL Spinner with the Material style. You can use it like any regular Spinner.
Add floating label text, hint and error messages.

## Screenshots


## Usages

Use this dependency in your build.gradle file to reference this library in your project

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```

Step 2. Add the dependency
```groovy
dependencies {
    compile ''
}


If you use other libraries requiring nineoldandroids and appcompat-v7 like [MaterialEditText](https://github.com/rengwuxian/MaterialEditText/) make sure to exclude them :
```groovy
compile (''){
        exclude group: 'com.nineoldandroids', module: 'library'
        exclude group: 'com.android.support', module: 'appcompat-v7'
}
```

In the xml : 

```xml
<ir.hamsaa.RtlMaterialSpinner
        android:id="@+id/spinner"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content" 
        app:ms_hint="hint"
        app:ms_enableFloatingLabel="false"
        app:ms_enableErrorLabel="false"
        app:ms_floatingLabelText="floating label"
        app:ms_baseColor="@color/base"
        app:ms_highlightColor="@color/highlight"
        app:ms_errorColor="@color/error"
        app:ms_typeface="typeface.ttf"
        app:ms_thickness="2dp"
        app:ms_hintColor="@color/hint"
        app:ms_arrowColor="@color/arrow"
        app:ms_arrowSize="16dp"
        app:ms_alignLabels="false"
        app:ms_floatingLabelColor="@color/floating_label"/>
```
You can set a hint and a floating label text. If no floating label text is provided, the hint will be set instead.


In your Java Code, you use it like a regular spinner, setting an adapter to it.
```java
 String[] ITEMS = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};
 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ITEMS);
 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
 spinner = (RtlMaterialSpinner) findViewById(R.id.spinner);
 spinner.setAdapter(adapter);
```

If you need to set an error message, you can do it the same way than with an EditText :
```java
 //Activate
 spinner.setError("Error");
 //Desactivate
 spinner.setError(null);
```

## License
```
   
The MIT License (MIT)

Copyright (c) 2017 Hamsaa.ir

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```


