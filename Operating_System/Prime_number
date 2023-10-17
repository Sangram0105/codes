echo Enter number
read n
m=`expr $n / 2`
i=2
if [ $n -eq 1 ]
then
echo $n is not a prime
fi
while [ $i -le $m ]
do
rem=`expr $n % $i`
if [ $rem -eq 0 ]
then
echo $n not a prime
break
fi
i=`expr $i + 1`
done
p=`expr $m + 1`
if [ $i -eq $p ]
then
echo $n is a prime number
fi
