# MP3 Metadata Viewer

A Maven-based Java project that extracts and displays metadata from MP3 files using the `mp3agic` library. This tool provides a simple and efficient way to analyze and view information such as artist, album, title, and more.

## Features

- Extract metadata from MP3 files.
- Display metadata such as artist, album, title, track number, year, genre, and more.

## Getting Started

### Clone the Repository

git clone https://github.com/onurkantarci/mp3-maven.git
<br>
cd mp3-maven
<br>


## Build the Project
### Use Maven to build the project:

mvn clean install

## Usage
Place your MP3 files in a directory.
<br>
Run the application and provide the path to the MP3 file in the terminal like this. <br> **java -jar target/mp3-maven-1.0-SNAPSHOT-jar-with-dependencies.jar "examplepath".**
<br>
The application will display the metadata for the specified MP3 file.


## Example Output
- Artist: Example Artist
- Album: Example Album
- Comment: 1
- Year: 2024
- Genre: Rock