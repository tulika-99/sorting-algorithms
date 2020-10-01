extension Array where Element : Comparable {
    func sortedIS() -> [Self.Element] {
        var list = self
        
        for i in 1 ..< count {
            let key = list[i]
            var j = i - 1
            
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j]
                j = j - 1
            }
            list[j + 1] = key
        }
        
        return list
    }
}