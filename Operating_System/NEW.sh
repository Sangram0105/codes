
while [1]

echo 1.create2.display3.insert4.search5.modify6.delete7.exit
echo -n "enter your choice\n"
read ch
case $ch in 

1) echo "enter the name of file"
  read fname
     if[ -e fname]
     then 
          echo "file already exit"
      else 
     
                >>$fname   
          echo "file is created"

     fi
     ;;           
 
2) echo "enter the name of file "
   read fname 

   if[ -e $fname ]
   then echo the content of file is :-
       sort -n $fname
    else 
    echo file not exit 
    fi
;;       
3) echo "Enter the name of file"
   read fname
   if[ -e $fname ]
   then  
   echo enter the roll number 
   read roll
   grep -w "$roll" $fname
   ans=$?

    if[ $ans -eq 0 ]
     then echo record alreday exit
     else
        echo enter the name  student 
        read name
        echo $roll $name >>$fname
        echo "record succesfully inserted"

     fi
    else
      echo "file does not exit" 

    fi
;;
4) echo "enter the name of file"
   read fname
   if[ -e $fname ]
   then 
      echo Enter the roll number to search 
      read roll
      grep -w "$roll" $fname
      ans=$?

      if[ ans -eq 0 ]
      then echo record found
      else
          echo record not found

      fi
   fi

 ;;

5) echo "enter the name of file"
    read fname
    if[ -e $fname ]
    then echo enter the roll number 
    read roll
    grep -w "$roll" $fname
    ans =$?
       if[ ans -eq 0 ]
       then   echo record already exit 
       else
            echo enter the newroll and newname
            read  nroll nname
            grep -w "$nroll" $fname
            ans=$?
            if[ ans -eq 0 ]
            then 
             grep -v "$nroll" $fname >> temp
             echo "$nroll $nname">> temp

             rm $fname
            cp temp $fname
            rm temp
        fi    

    fi

;;

6) echo "enter the name of file"
    read fname
    if[ -e $fname ]
    then echo enter the roll number 
    read roll
    grep -w "$roll" $fname
    ans =$?
       if[ ans -eq 0 ]
       then   echo record already exit 
       else
           
            grep -v "$roll" $fname >>temp
          
            rm $fname
            cp temp $fname
            rm temp
        fi    

    fi

;;

7)exit
;;

*) echo "wrong option"

 esac
done