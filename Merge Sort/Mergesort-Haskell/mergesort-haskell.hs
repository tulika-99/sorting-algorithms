first :: ([a],[a]) -> [a]
first (a, b) = a

second :: ([a],[a]) -> [a]
second (a, b) = b

half :: [a] -> ([a],[a])
half [] = ([],[])
half l = (take n l, drop n l)
            where 
                n = div (length l) 2

merge :: Ord a => [a] -> [a] -> [a]
merge l [] = l
merge [] l = l
merge (x:xs) (y:ys) | x < y = x: merge (xs) (y:ys)
                    | otherwise = y: merge (x:xs) (ys)

msort :: Ord a => [a] -> [a]
msort [] = []
msort [a] = [a]
msort l = aux1 (first (aux l)) (second (aux l))  
            where  
                aux l = half l
                aux1 l1 l2 = merge (msort l1) (msort l2)