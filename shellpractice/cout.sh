
#!/bin/bash

#Function for count in the lines in a file

count_linesfile() {

	line_count=$(wc -l < "$filename")

	echo "The number of lines in $filename is: $line_count"


}

#Function call

echo "Enter filename" 
read filename
count_linesfile  "$filename"

