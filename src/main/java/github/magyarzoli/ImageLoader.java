package github.magyarzoli;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Calling it by uploading it to an array by searching for the given values.
 * You can upload an array with the images in the folder. {@code loadImages(String)}
 * You can populate an array with the names of the images in the folder. {code loadImagesName(String)}
 * @since       1.0
 * @author      <a href=https://github.com/MagyarZoli>Magyar Zoltán</a>
 */
public class ImageLoader {

    /**
     * Store imageIcons, file of type jpg jpeg or png.
     */
    private static List<ImageIcon> imageIcons = new ArrayList<>();

    /**
     * Store imageIcons name, file of type jpg jpeg or png.
     */
    private static List<String> imageIconsName = new ArrayList<>();

    /**
     * Storing files for operating methods.
     */
    private static File[] files;

    /**
     * {@code loadImagesArray}, which appears to be designed to load image files from a specified folder path,
     * create {@link javax.swing.ImageIcon ImageIcon} objects from them, and return a list of these {@code ImageIcon}.
     * <ul>
     *     <li>Clears the {@code imageIconsName} collection. It seems that imageIconsName is used to store image
     *     file names.</li>
     *     <li>Creates a new {@link java.io.File File} object using the {@code folderPath} provided as an argument
     *     and then calls the {@link java.io.File#listFiles() listFiles()} method on it to retrieve an array of
     *     {@code File} objects representing the files in the specified folder. This array of files is assigned to
     *     the files variable.</li>
     *     <li>The beginning of a {@code try} block, indicating that the following code might throw an exception.</li>
     *     <li>calls the {@code uploadImageIcons()} method, which is intended to populate the {@code imageIcons}
     *     collection with {@code ImageIcon} objects created from the image files in the specified folder. If an
     *     {@code IOException} occurs during this process, it will be caught by the following {@code catch} block.</li>
     *     <li>The beginning of a {@code catch} block that handles an {@code IOException} if one occurs during the
     *     execution of the code within the {@code try} block.</li>
     *     <li>Throws a {@link java.lang.RuntimeException RuntimeException} with the caught {@code IOException} as
     *     its cause. This effectively converts the checked exception into an unchecked one, allowing it to propagate
     *     up the call stack without needing to declare it in the method's signature.</li>
     *     <li> After handling potential exceptions, this line returns the {@code imageIcons} collection containing
     *     the created {@code ImageIcon} objects from the loaded image files.</li>
     *     <li>Returns the result of calling the {@code loadImagesList} method with the folderPath argument.
     *     This method loads image files from the specified folder path and returns a list of {@code ImageIcon}
     *     objects. Then, the {@link java.util.List#toArray() toArray} method is called on this list to convert
     *     it into an array of {@code ImageIcon} objects.</li>
     *     <li>This part of the code specifies the type of the array that you want to create. In this case, it's an
     *     array of {@code ImageIcon} objects. The value <i>0</i> indicates that the array has an initial size of
     *     <i>0</i>, which means it will dynamically adjust its size to match the number of elements in the list.</li>
     * </ul>
     * {@code loadImagesArray}, this method is intended to load image files from a specified folder path, create
     * {@code ImageIcon} objects from them, and return a list of these {@code ImageIcon} objects. It first clears
     * the collection holding image file names, retrieves the list of files from the provided folder path, attempts
     * to populate the {@code ImageIcon} objects into the {@code imageIcons} collection using the
     * {@code uploadImageIcons()} method, and if any exceptions occur, it converts them into unchecked exceptions.
     * Finally, it returns the collection of {@code ImageIcon} objects. Converting the list of {@code ImageIcon}
     * objects into an array of {@code ImageIcon} objects.
     * @param       folderPath Objects representing the files in the specified folder.
     * @return      The collection of {@code ImageIcon} objects.
     * @see         github.magyarzoli.ImageLoader#loadImagesList(String) loadImagesList(String)
     */
    public static ImageIcon[] loadImagesArray(String folderPath) {
        return loadImagesList(folderPath).toArray(new ImageIcon[0]);
    }

    /**
     * {@code loadImagesNameArray}, which is designed to load the names of image files from a specified folder path.
     * <ul>
     *     <li>Clears the {@code imageIconsName} collection. It appears that {@code imageIconsName} is being used
     *     to store the names of image files.</li>
     *     <li>Creates a new {@link java.io.File File} object using the {@code folderPath} provided as an argument,
     *     and then calls the {@link java.io.File#listFiles() listFiles()} method on it to retrieve an array of
     *     {@code File} objects representing the files in the specified folder. This array of files is assigned to
     *     the {@code files} variable.</li>
     *     <li>The beginning of a {@code try} block, indicating that the following code might throw an exception.</li>
     *     <li>This line calls the {@code uploadImageIconsName()} method, which is intended to populate the
     *     {@code imageIconsName} collection with the names of image files in the specified folder. If an
     *     {@code IOException} occurs during this process, it will be caught by the following {@code catch} block.</li>
     *     <li>The beginning of a {@code catch} block that handles an {@code IOException} if one occurs during
     *     the execution of the code within the {@code try} block.</li>
     *     <li>Throws a {@link java.lang.RuntimeException RuntimeException} with the caught {@code IOException} as
     *     its cause. This effectively converts the checked exception into an unchecked one, allowing it to propagate
     *     up the call stack without needing to declare it in the method's signature.</li>
     *     <li>After handling potential exceptions, this line returns the {@code imageIconsName} collection containing
     *     the names of the loaded image files.</li>
     *     <li>Returns the result of calling the {@code loadImagesNameList} method with the {@code folderPath}
     *     argument. This method loads image file names from the specified folder path and returns a list of strings
     *     (names of image files). Then, the {@link java.util.List#toArray() toArray} method is called on this list
     *     to convert it into an array of strings.</li>
     *     <li>This part of the code specifies the type of the array that you want to create. In this case, it's an
     *     array of strings. The value <i>0</i> indicates that the array has an initial size of <i>0</i>, which means
     *     it will dynamically adjust its size to match the number of elements in the list.</li>
     * </ul>
     * {@code loadImagesNameArray} this method is designed to load the names of image files from a specified folder
     * path. It first clears the collection holding the names, then retrieves the list of files from the provided
     * folder path. It attempts to populate the names of image files into the collection using the
     * {@code uploadImageIconsName()} method, and if any exceptions occur, it converts them into unchecked exceptions.
     * Finally, it returns the collection of image file names. converting the list of String objects into an array of
     * String objects.
     * @param       folderPath Objects representing the files in the specified folder.
     * @return      The collection of image file names
     * @see         github.magyarzoli.ImageLoader#loadImagesNameList(String) loadImagesNameList(String)
     */
    public static String[] loadImagesNameArray(String folderPath) {
        return loadImagesNameList(folderPath).toArray(new String[0]);
    }

    /**
     * {@code loadImagesList}, which appears to be designed to load image files from a specified folder path,
     * create {@link javax.swing.ImageIcon ImageIcon} objects from them, and return a list of these {@code ImageIcon}.
     * <ul>
     *     <li>Clears the {@code imageIconsName} collection. It seems that imageIconsName is used to store image
     *     file names.</li>
     *     <li>Creates a new {@link java.io.File File} object using the {@code folderPath} provided as an argument
     *     and then calls the {@link java.io.File#listFiles() listFiles()} method on it to retrieve an array of
     *     {@code File} objects representing the files in the specified folder. This array of files is assigned to
     *     the files variable.</li>
     *     <li>The beginning of a {@code try} block, indicating that the following code might throw an exception.</li>
     *     <li>calls the {@code uploadImageIcons()} method, which is intended to populate the {@code imageIcons}
     *     collection with {@code ImageIcon} objects created from the image files in the specified folder. If an
     *     {@code IOException} occurs during this process, it will be caught by the following {@code catch} block.</li>
     *     <li>The beginning of a {@code catch} block that handles an {@code IOException} if one occurs during the
     *     execution of the code within the {@code try} block.</li>
     *     <li>Throws a {@link java.lang.RuntimeException RuntimeException} with the caught {@code IOException} as
     *     its cause. This effectively converts the checked exception into an unchecked one, allowing it to propagate
     *     up the call stack without needing to declare it in the method's signature.</li>
     *     <li> After handling potential exceptions, this line returns the {@code imageIcons} collection containing
     *     the created {@code ImageIcon} objects from the loaded image files.</li>
     * </ul>
     * {@code loadImagesList}, this method is intended to load image files from a specified folder path, create
     * {@code ImageIcon} objects from them, and return a list of these {@code ImageIcon} objects. It first clears
     * the collection holding image file names, retrieves the list of files from the provided folder path, attempts
     * to populate the {@code ImageIcon} objects into the {@code imageIcons} collection using the
     * {@code uploadImageIcons()} method, and if any exceptions occur, it converts them into unchecked exceptions.
     * Finally, it returns the collection of {@code ImageIcon} objects.
     * @param       folderPath Objects representing the files in the specified folder.
     * @return      The collection of {@code ImageIcon} objects.
     * @see         github.magyarzoli.ImageLoader#uploadImageIcons() uploadImageIcons()
     */
    public static List<ImageIcon> loadImagesList(String folderPath) {
        imageIconsName.clear();
        files = new File(folderPath).listFiles();
        try {
            uploadImageIcons();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return imageIcons;
    }

    /**
     * {@code loadImagesNameList}, which is designed to load the names of image files from a specified folder path.
     * <ul>
     *     <li>Clears the {@code imageIconsName} collection. It appears that {@code imageIconsName} is being used
     *     to store the names of image files.</li>
     *     <li>Creates a new {@link java.io.File File} object using the {@code folderPath} provided as an argument,
     *     and then calls the {@link java.io.File#listFiles() listFiles()} method on it to retrieve an array of
     *     {@code File} objects representing the files in the specified folder. This array of files is assigned to
     *     the {@code files} variable.</li>
     *     <li>The beginning of a {@code try} block, indicating that the following code might throw an exception.</li>
     *     <li>This line calls the {@code uploadImageIconsName()} method, which is intended to populate the
     *     {@code imageIconsName} collection with the names of image files in the specified folder. If an
     *     {@code IOException} occurs during this process, it will be caught by the following {@code catch} block.</li>
     *     <li>The beginning of a {@code catch} block that handles an {@code IOException} if one occurs during
     *     the execution of the code within the {@code try} block.</li>
     *     <li>Throws a {@link java.lang.RuntimeException RuntimeException} with the caught {@code IOException} as
     *     its cause. This effectively converts the checked exception into an unchecked one, allowing it to propagate
     *     up the call stack without needing to declare it in the method's signature.</li>
     *     <li>After handling potential exceptions, this line returns the {@code imageIconsName} collection containing
     *     the names of the loaded image files.</li>
     * </ul>
     * {@code loadImagesNameList} this method is designed to load the names of image files from a specified folder
     * path. It first clears the collection holding the names, then retrieves the list of files from the provided
     * folder path. It attempts to populate the names of image files into the collection using the
     * {@code uploadImageIconsName()} method, and if any exceptions occur, it converts them into unchecked exceptions.
     * Finally, it returns the collection of image file names.
     * @param       folderPath Objects representing the files in the specified folder.
     * @return      The collection of image file names
     * @see         github.magyarzoli.ImageLoader#uploadImageIconsName() uploadImageIconsName()
     */
    public static List<String> loadImagesNameList(String folderPath) {
        imageIconsName.clear();
        files = new File(folderPath).listFiles();
        try {
            uploadImageIconsName();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return imageIconsName;
    }

    /**
     * {@code uploadImageIcons}, which seems to be intended to upload image files (with specific extensions) and
     * create {@code ImageIcon} objects from them.
     * @throws      IOException if an error related to file I/O occurs.
     * <ul>
     *     <li>This initiates a loop that iterates through each {@link java.io.File File} object in the files
     *     collection</li>
     *     <li>This {@code if} statement checks whether the current {@code File} object represents a regular file
     *     (not a directory) and if it's an image file using the {@code isImageFile} method defined earlier. If both
     *     conditions are {@code true}, the code inside the if block will be executed.</li>
     *     <li>This line reads the image data from the current file using the {@link javax.imageio.ImageIO ImageIO}.
     *     {@link javax.imageio.ImageIO#read(File) read} method, creates an {@link javax.swing.ImageIcon ImageIcon}
     *     object from the image data, and assigns it to the {@code icon} variable.</li>
     *     <li>This line adds the created {@code ImageIcon} object to the {@code imageIcons} collection.</li>
     * </ul>
     * {@code uploadImageIcons} this method iterates through a collection of {@code File} objects named files. For
     * each file that is a regular file and has an image extension ("jpg", "jpeg", or "png"), it reads the image
     * data from the file, creates an {@code ImageIcon} object from the image data, and adds it to the
     * {@code imageIcons} collection. The {@code isImageFile} method is used to determine if a file is an image
     * based on its extension.
     * @see     github.magyarzoli.ImageLoader#isImageFile(File) isImageFile(File)
     */
    private static void uploadImageIcons()
    throws IOException {
        for (File file : files) {
            if (file.isFile() && isImageFile(file)) {
                imageIcons.add(new ImageIcon(ImageIO.read(file)));
            }
        }
    }

    /**
     * {@code uploadImageIconsName} which appears to be intended to upload the names of image files (with specific
     * extensions) into a collection named {@code imageIconsName}.
     * @throws      IOException if an error related to file I/O occurs.
     * <ul>
     *     <li>This initiates a loop that iterates through each {@link java.io.File File} object in the files
     *     collection.</li>
     *     <li>This {@code if} statement checks whether the current {@code File} object represents a regular file
     *     (not a directory) and if it's an image file using the {@code isImageFile} method defined earlier. If
     *     both conditions are {@code true}, the code inside the {@code if} block will be executed.</li>
     *     <li>This line adds the name of the current file (which is assumed to be an image file) to the
     *     {@code imageIconsName} collection. The {@link java.io.File#getName() getName()} method returns the name
     *     of the file.</li>
     * </ul>
     * {@code uploadImageIconsName} this method iterates through a collection of File objects named files. For each
     * file that is a regular file and has an image extension ("jpg", "jpeg", or "png"), it adds the name of the
     * file to the {@code imageIconsName} collection. The assumption is that files contains a list of files that
     * are to be examined for image extensions, and the {@code isImageFile} method is used to determine if a file
     * is an image based on its extension.
     * @see     github.magyarzoli.ImageLoader#isImageFile(File) isImageFile(File)
     */
    private static void uploadImageIconsName()
    throws IOException {
        for (File file : files) {
            if (file.isFile() && isImageFile(file)) {
                imageIconsName.add(file.getName());
            }
        }
    }

    /**
     * {@code isImageFile} which takes a {@link java.io.File File} object as an argument and returns a boolean value
     * indicating whether the file has an image extension (JPG, JPEG or PNG).
     * <ul>
     *     <li>This line calls the {@code getFileExtension} method you provided in your previous code to get the
     *     lowercase extension of the given {@code File} object.</li>
     *     <li>This line uses the {@code extension} variable to check whether the extracted extension matches any
     *     of the three specified image formats: "jpg", "jpeg", or "png". The {@link java.lang.String#equals(Object)
     *     equals} method is used to compare the extension with each format. The result of the logical OR
     *     {@code (||)} operation determines whether the file has an image extension. If any of the conditions are
     *     {@code true}, the method returns true, indicating that the file is an image. Otherwise, it returns
     *     {@code false}.</li>
     * </ul>
     * {@code isImageFile} this method is used to determine if a given {@code File} object corresponds to an image
     * file with an extension of "jpg", "jpeg", or "png".
     * @param       file Takes a {@code File} object as an argument
     * @return      Boolean value indicating whether the file has an image extension (JPG, JPEG or PNG)
     * @see         github.magyarzoli.ImageLoader#getFileExtension(File) getFileExtension(File)
     */
    private static boolean isImageFile(File file) {
        String extension = getFileExtension(file);
        return (extension.equals("jpg") || extension.equals("jpeg")|| extension.equals("png"));
    }

    /**
     * {@code getFileExtension} that takes a {@link java.io.File File} object as an argument and returns the lowercase
     * extension of the file.
     * <ul>
     *     <li>This line extracts the name of the file (including its extension) from the given {@code File}
     *     object.</li>
     *     <li>This line finds the index of the last occurrence of the dot character {@code ('.')} in the
     *     {@code fileName}. This dot is used to separate the filename from its
     *     extension.</li>
     *     <li>This {@code if} statement checks whether a valid dot index was found. The condition ensures that the
     *     dot is not the first or last character in the {@code fileName}.</li>
     *     <li>Inside the {@code if} block, this line extracts the substring after the dot (the file extension) using
     *     the {@link java.lang.String#substring(int) substring} method. The {@code (dotIndex + 1)} argument ensures
     *     that the dot itself is not included in the extracted extension. The {@link java.lang.String#toLowerCase()
     *     toLowerCase} method is then used to convert the extension
     *     to lowercase.</li>
     *     <li>If the conditions in the {@code if} statement are not met (no valid extension found), an empty string
     *     is returned.</li>
     * </ul>
     * {@code getFileExtension} this method is used to extract the lowercase file extension from a given {@code File}
     * object. It handles cases where there might be no extension or where the dot might appear as the first or last
     * character in the filename.
     * @param       file {@code File} object as an argument.
     * @return      The lowercase extension of the file.
     */
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < (fileName.length() - 1)) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return "";
    }
}