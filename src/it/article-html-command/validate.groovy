import java.io.*;


File outputDir = new File( basedir, "target/docs" )

String[] expectedFiles = ["sample.html"]

for ( String expectedFile : expectedFiles ) {
    File file = new File( outputDir, expectedFile )
    println ( "Checking for existence of " + file )
    if ( !file.isFile() ) {
        throw new Exception( "Missing file " + file )
    }
}

return true;