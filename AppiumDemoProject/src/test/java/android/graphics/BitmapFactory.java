package android.graphics;

public class BitmapFactory {

	import android.graphics.Bitmap;
	import java.nio.ByteBuffer;
	import java.nio.ByteBuffer;
	import java.util.Arrays;

	public static boolean imagesEquals(Bitmap bitmap1, Bitmap bitmap2) {
		
		Bitmap bitmap11 = BitmapFactory.decodeFile("/path/to/screeshot/screenshot.jpg");
		Bitmap bitmap21 = BitmapFactory.decodeFile("/path/to/image_that_will_be_compared/assertionImage.jpg");
	}
	    ByteBuffer buffer1 = ByteBuffer.allocate(bitmap1.getHeight() * bitmap1.getRowBytes());
	    bitmap1.copyPixelsToBuffer(buffer1);

	    ByteBuffer buffer2 = ByteBuffer.allocate(bitmap2.getHeight() * bitmap2.getRowBytes());
	    bitmap2.copyPixelsToBuffer(buffer2);

	    return Arrays.equals(buffer1.array(), buffer2.array());
	}