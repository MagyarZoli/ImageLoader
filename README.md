[![Apache License, Version 2.0, January 2004](https://img.shields.io/github/license/apache/maven.svg?label=License)][license]

# ImageLoader

## Description
Upload images stored in a folder to the ImageIcon array or list.

## Dependency
**Maven:**
```xml
<dependency>
    <groupId>github.magyarzoli</groupId>
    <artifactId>ImageLoader</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Features
Calling it by uploading it to an array by searching for the given values.
* You can upload an array with the images in the folder. `loadImagesArray(String)`
* You can populate an array with the names of the images in the folder. `loadImagesNameArray(String)`
* You can upload a list with the images in the folder. `loadImagesList(String)`
* You can populate a list with the names of the images in the folder. `loadImagesNameList(String)`

## Example
Before methods uploads the array it was called from, after specifying the location of the folder,
* it checks which file image type it is,
* then uploads these files to the specified array and passes it to the array of the called class.

### Authors
Magyar Zoltán

### Contact
magyarz95@gmail.com

[license]: https://www.apache.org/licenses/LICENSE-2.0