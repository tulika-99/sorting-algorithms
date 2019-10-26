def pancake_sort(a)
    n=a.length
    for i in n.downto(2)
        max_i=find_max(a,i)
            unless max_i == i-1
            flip(a,max_i)
            flip(a,i-1)
        end
    end
    return a
end

def find_max(a,len)
    max_i=0
    i=1
    while i<len
       max_i=i if a[i]>a[max_i]
       i+=1
    end
    return max_i
end

def flip(a,len)
    start=0
    while start<len
        a[start],a[len]=a[len],a[start]
        start+=1
        len-=1
    end
end

p a = (1..9).to_a.shuffle
p pancake_sort(a)
