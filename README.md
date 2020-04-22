# RCOBOLDI

R COBOL DI (Data Integration) Package: An R package that facilitates the importation of COBOL CopyBook data directly into the R Project for Statistical Computing as properly structured data frames.

Note that not all copybook files can be converted into CSV -- for example single-record type files can be converted to CSV however complicated multi-record type files will NOT map to CSV.

# Examples

## [Example One](SIMPLE_EXAMPLE.md) : Local package installation and then convert a COBOL data files into data frames.

Load the RCOBOLDI package locally and use it to convert COBOL data files into data frames. 

This example also how includes a call to ```CobolToCSV```.

## [Docker Example](DOCKER_EXAMPLE.md) : If you just want to try the package on some test data, start here.

All you'll need to run this example is Docker and an Internet connection.

# Logging

The Java API uses Log4J and writes files to the ~/rcoboldi-package-logs/ directory. The Log4J configuration file can be found [here](java/rcoboldi-core/src/main/resources).

# See Also

- [JRecord: Read Cobol data files in Java on SourceForge](https://sourceforge.net/projects/jrecord/)
- [JRecord: Read Cobol data files in Java on GitHub](https://github.com/bmTas/JRecord)
- [AbsaOSS cobrix: A COBOL parser and Mainframe/EBCDIC data source for Apache Spark](https://github.com/AbsaOSS/cobrix)
- [(DataBricks) Cobrix: A Mainframe Data Source for Spark SQL and Streaming](https://databricks.com/session/cobrix-a-mainframe-data-source-for-spark-sql-and-streaming)
- [(YouTube) Cobrix: A Mainframe Data Source for Spark SQL and Streaming](https://www.youtube.com/watch?v=BOBIdGf3Tm0)
- [zenaptix-lab / copybookStreams](https://github.com/zenaptix-lab/copybookStreams)
- [EBCDIC on Wikipedia](https://en.wikipedia.org/wiki/EBCDIC)
- [Cobol hits 50 and keeps counting](https://www.theguardian.com/technology/2009/apr/09/cobol-internet-programming)
