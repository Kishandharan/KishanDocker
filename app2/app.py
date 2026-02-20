strt1 = 1 
end1 = 10 
strt2 = 1
end2 = 10 

for j in range(strt1, end1+1, 1):
    for i in range(strt2, end2+1, 1):
        print(f"{j}*{i}={i*j}")
    print()

