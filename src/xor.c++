t=int(input())
result=[]
for _ in range(t):
    n=int(input())
    arr=[int(x) for x in input().split()]
    cout = float('inf')

    for i in range (n-1):
        temp=max(arr[i],arr[i+1])
        count=min(count,temp)
    result.append(count-1)
for x in result:
    print(x)