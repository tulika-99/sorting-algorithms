
--quicksort
qsort :: Ord l => [l] -> [l]
qsort [] = []
qsort (x:xs) = (qsort [ l | l <- xs, l < x]) ++ [x] ++ (qsort [ r | r <- xs, r >= x])
