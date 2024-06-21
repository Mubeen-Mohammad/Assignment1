while true; do

   echo "Enter the Number"
   read n

   if [ "$n" -eq 0 ]; then
       #echo "Terminate the program"
       break
   fi

   if [ $((n % 2)) -eq 0 ]; then
       echo "$n is Even number"
   else
       echo "$n is Odd number"
   fi
done

