package com.coherentlogic.rproject.integration.rcobol.api;

import java.io.IOException;

import com.coherentlogic.rproject.integration.rcobol.api.JCopyBookConverter.PassThroughUpdateFieldName;

import net.sf.JRecord.Common.Conversion;

/**
 * 
Not all copybook files can be converted into CSV.

Single Record Type files can be converted to CSV.
Complicated Multi-Record files will NOT map to CSV.

If you have the Sourceforge JRecord download there are the following directories

* SampleFiles
* CopyBook\Cobol

The following File/Copybook combinarions should work well:

Copybook File

AmsLocation.cbl Ams_LocDownload_20041228.txt - Standard Text file
DTAR020.cbl DTAR020.bin - Mainframe Binary File (Fixed Width
DTAR107.cbl DTAR107.bin

If you are using supplied Cobol2Csv program the scripts would be like (Windows):

For AmsLocation.cbl :

../lib/Cobol2Csv.bat -C G:/Users/ExampleUserTst01/RecordEditor_HSQL/CopyBook/Cobol/AmsLocation.cbl ^
-Delimiter , ^
-Quote doublequote ^
-IFS Text ^
-I G:/Users/ExampleUserTst01/RecordEditor_HSQL/SampleFiles/Ams_LocDownload_20041228.txt ^
-O G:/Users/ExampleUserTst01/RecordEditor_HSQL/SampleFiles/Ams_LocDownload_20041228.txt.csv

For DTAR020:

../lib/Cobol2Csv.bat -C G:/Users/ExampleUserTst01/RecordEditor_HSQL/CopyBook/Cobol/DTAR020.cbl ^
-Delimiter , ^
-Quote doublequote ^
-IFS Fixed_Length ^
-IC cp037 ^
-I G:/Users/ExampleUserTst01/RecordEditor_HSQL/SampleFiles/DTAR020.bin ^
-O G:/Users/ExampleUserTst01/RecordEditor_HSQL/SampleFiles/DTAR020.bin.csv

Also RecordEditor/RecsvEditor can generate Cobol2Csv Scripts from a copybook/file.

 * -----
./Source/OtherSource/JRecord_Cobol2Json_package/cobolToJson/src/net/sf/JRecord/cbl2json/zExampleGen/Dtar020ToJson.java

  * *------------- Keep this notice in your final code ---------------
  * *   This code was generated by JRecord projects CodeGen program
  * *            on the: 20 Jun 2016 13:43:8
  * *     from Copybook: DTAR020.cbl
  * *           Dialect: FMT_MAINFRAME
  * *          Template: javaCbl2Json
  * *             Split: SPLIT_NONE
  * * File Organization: IO_FIXED_LENGTH
  * *              Font: cp037
 *
 */
public class Main {

    static String executeExample1 (JCopyBookConverter jCopyBookConverter) throws IOException {

        var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/Examples/SchemaCompare/cobol_copybooks/DTAR020.cbl";
        var inFile       = "/Users/thospfuller/development/projects/rcobol/download/Source/JRecord/src/net/sf/JRecord/zTest/Common/SampleFiles/DTAR020.bin";

        var inFont = "cp037";

        /**
         * https://sourceforge.net/p/jrecord/wiki/Home/
         * https://sourceforge.net/p/jrecord/wiki/Cobol2Csv%2C%20Csv2Cobol/
         * https://github.com/svn2github/jrecord/blob/master/Source/JRecord_Cbl2Csv/src/net/sf/JRecord/cbl2csv/Cobol2Csv.java -- binFormat is the dialect.
         *
         * String copyBookFile, String font, String sep, String quote, IUpdateFieldName updateFldName
         */
        var result = jCopyBookConverter.readCopyBookAsString (
            copyBookFile,
            inFile,
            "Fixed Length Binary",
            inFont,
            new PassThroughUpdateFieldName ()
        );

        return result;
    }

    static String executeExample2 (JCopyBookConverter jCopyBookConverter) throws IOException {

        var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/Examples/SchemaCompare/cobol_copybooks/DTAR107.cbl";
        var inFile       = "/Users/thospfuller/development/projects/rcobol/download/Source/JRecord/src/net/sf/JRecord/zTest/Common/SampleFiles/DTAR107.bin";

        var inFont = "cp037";

        /**
         * https://sourceforge.net/p/jrecord/wiki/Home/
         * https://sourceforge.net/p/jrecord/wiki/Cobol2Csv%2C%20Csv2Cobol/
         * https://github.com/svn2github/jrecord/blob/master/Source/JRecord_Cbl2Csv/src/net/sf/JRecord/cbl2csv/Cobol2Csv.java -- binFormat is the dialect.
         *
         * String copyBookFile, String font, String sep, String quote, IUpdateFieldName updateFldName
         */
        var result = jCopyBookConverter.readCopyBookAsString (
            copyBookFile,
            inFile,
            "Fixed Length Binary",
            inFont,
            new PassThroughUpdateFieldName ()
        );

        return result;
    }

    static String executeExample3 (JCopyBookConverter jCopyBookConverter) throws IOException {

        var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/CopyBook/Cobol/AmsLocation.cbl";
        var inFile       = "/Users/thospfuller/development/projects/rcobol/download/SampleFiles/Ams_LocDownload_20041228.txt";

        var inFont = Conversion.DEFAULT_ASCII_CHARSET;//"cp037";

        /**
         * https://sourceforge.net/p/jrecord/wiki/Home/
         * https://sourceforge.net/p/jrecord/wiki/Cobol2Csv%2C%20Csv2Cobol/
         * https://github.com/svn2github/jrecord/blob/master/Source/JRecord_Cbl2Csv/src/net/sf/JRecord/cbl2csv/Cobol2Csv.java -- binFormat is the dialect.
         *
         * String copyBookFile, String font, String sep, String quote, IUpdateFieldName updateFldName
         */
        var result = jCopyBookConverter.readCopyBookAsString (
            copyBookFile,
            inFile,
            "Text",
            inFont,
            new PassThroughUpdateFieldName ()
        );

        return result;
    }

    public static void main(String[] args) throws IOException {

        var jCopyBookConverter = new JCopyBookConverter ();

        System.out.println ("Example 1: " + executeExample1 (jCopyBookConverter));
        System.out.println ("Example 2: " + executeExample2 (jCopyBookConverter));
        System.out.println ("Example 3: " + executeExample3 (jCopyBookConverter));
    }
}

//WORKING / "Fixed Length Binary", IFS = "cp037"       var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/Examples/SchemaCompare/cobol_copybooks/DTAR020.cbl";
//var inFile       = "/Users/thospfuller/development/projects/rcobol/download/Source/JRecord/src/net/sf/JRecord/zTest/Common/SampleFiles/DTAR020.bin";

//WORKING / "Fixed Length Binary", IFS = "cp037"        var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/Examples/SchemaCompare/cobol_copybooks/DTAR107.cbl";
//var inFile       = "/Users/thospfuller/development/projects/rcobol/download/Source/JRecord/src/net/sf/JRecord/zTest/Common/SampleFiles/DTAR107.bin";

/* WORKING FIS = Text, inFont = Conversion.DEFAULT_ASCII_CHARSET
var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/CopyBook/Cobol/AmsLocation.cbl";
var inFile       = "/Users/thospfuller/development/projects/rcobol/download/SampleFiles/Ams_LocDownload_20041228.txt";
var result = jCopyBookConverter.readCopyBookAsString (
copyBookFile,
inFile,
"Text",
inFont, 
",",
"\"",
new PassThroughUpdateFieldName ()
);
*/

//var copyBookFile = "/Users/thospfuller/development/projects/rcobol/download/CopyBook/Cobol/AmsLocation.cbl";
//var inFile       = "/Users/thospfuller/development/projects/rcobol/download/SampleFiles/Ams_LocDownload_20041228.txt";
//
//var jCopyBookConverter = new JCopyBookConverter ();
//
//var inFont = Conversion.DEFAULT_ASCII_CHARSET;//"cp037";
//
///**
//* https://sourceforge.net/p/jrecord/wiki/Home/
//* https://sourceforge.net/p/jrecord/wiki/Cobol2Csv%2C%20Csv2Cobol/
//* https://github.com/svn2github/jrecord/blob/master/Source/JRecord_Cbl2Csv/src/net/sf/JRecord/cbl2csv/Cobol2Csv.java -- binFormat is the dialect.
//*
//* String copyBookFile, String font, String sep, String quote, IUpdateFieldName updateFldName
//*/
//var result = jCopyBookConverter.readCopyBookAsString (
//  copyBookFile,
//  inFile,
//  "Text",
//  inFont,
//  new PassThroughUpdateFieldName ()
//);
//
//System.out.println (result);