echo "Enter file name"
read  file

#check if it is exist
if [ -f "$file" ]; then

	echo "File exists"

else
	echo "File not found"
fi
