package io.mdco
import java.io.File

// loop through files in the dir

// parse each name to get
// 1. Service Name
// 2. Service Layer (Source, Domain, Application)

// Build text to insert

// Find line to insert

// Add new material

class FileInsert {
    static void main(String[] args) {
        def list = []
        def PATH = ''
        
        if(args.length == 1) {
            PATH = args[0]
            println PATH
        }
        def dir = new File(PATH)
        dir.eachFileRecurse() { file->
            if (file.name=='docker-compose.yml')
            {
                println file.getAbsolutePath()
            }
        }
    }
}