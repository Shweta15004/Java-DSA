#shell & insert



def Insertion(arr,n):
  i=1
  for i in range(n):
    temp = arr[i]
    j=i-1
    while((j>=0) & (arr[j]>temp)):
      arr[j+1] = arr[j]
      j=j-1
    arr[j+1] = temp
    print(arr)

def shell(array, n):
    interval = n // 2
    while interval > 0:
        for i in range(interval, n):
            temp = array[i]
            j = i
            while j >= interval and array[j - interval] > temp:
                array[j] = array[j - interval]
                j -= interval

            array[j] = temp
            print(array)
        interval //= 2

print("\n Program For Insertion Sort")

print("\nHow many elements are there in Array?")

n=int(input())
li = []
for i in range(n):
  print("\n Enter element in Array")
  item = int(input())
  li.append(item)

print("Original array is\n")
print(li)
li2 = li.copy()


while True:
    try:
        s = input('Enter (i)insertion,  (s)shell,  (e)exit = ')
        if(s == 'i'):
            print("sorting is done by using insertion sort :")
            Insertion(li,n)
            li = li2.copy()
           
        elif(s == 's'):
            print('sorting is done by using shell sort :')
            shell(li,n)
            li = li2.copy()
            
        elif(s == 'e'):
            break
        else:
            print('invalid input')
    except ValueError:
        print('invalid input123')
