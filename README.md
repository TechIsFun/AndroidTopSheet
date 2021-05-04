TopSheet - a "top" version of BottomSheet
=========================================

[![Release](https://jitpack.io/v/TechIsFun/AndroidTopSheet.svg)](https://jitpack.io/#TechIsFun/AndroidTopSheet)

TopSheetBehaviour
-----
```java
View sheet = findViewById(R.id.top_sheet);
TopSheetBehavior.from(sheet).setState(TopSheetBehavior.STATE_EXPANDED);
```

TopSheetDialog
-----
```java
TopSheetDialog dialog = new TopSheetDialog(this);
dialog.setContentView(R.layout.sheet_content);
dialog.show();
```



License
-------

    Copyright 2021 Andrea Maglie

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
