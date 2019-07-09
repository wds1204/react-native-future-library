
# react-native-future

## Getting started

`$ npm install react-native-future --save`

### Mostly automatic installation

`$ react-native link react-native-future`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-future` and add `RNFuture.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFuture.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.futurehotel.library.RNFuturePackage;` to the imports at the top of the file
  - Add `new RNFuturePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-future'
  	project(':react-native-future').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-future/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-future')
  	```


## Usage
```javascript
import RNFuture from 'react-native-future';

// TODO: What to do with the module?
RNFuture;
```
  