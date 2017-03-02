package zip;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipFile;

public class Test {
	public static void main(String[] args) {

		try {
			ZipFile zf = new ZipFile("C:\\Users\\yangzhec\\Desktop\\apache-groovy-binary-2.4.8.zip");
			ZipArchiveEntry ze = zf.getEntry("groovy-2.4.8/lib/");
			InputStream inputStream = zf.getInputStream(ze);
			ZipArchiveInputStream zais = new ZipArchiveInputStream(inputStream);
			System.out.println(zais.canReadEntryData(ze));
			ZipArchiveEntry ae;
			while((ae = zais.getNextZipEntry())!=null){
				System.out.println(ae.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
