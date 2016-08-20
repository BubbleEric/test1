# Cordova Toast Plugin

## Using

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message)
     {
     	alert(message);
     }
     var failure = function()
      {
      	alert("Error calling Toast Plugin");
      }
    var map = {};
    map.message = "你好呀！";
    map.time = "2000";
    toast.show(map,success,failure);
```

Install  Android platform

    cordova platform add android
    
Run the code

    cordova run 