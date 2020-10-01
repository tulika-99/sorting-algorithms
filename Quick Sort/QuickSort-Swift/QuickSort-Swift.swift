extension Array where Element : Comparable {
    func sortedQS() -> [Self.Element] {
        guard count > 1 else { return self }
        let pivot = self.first!
        let tail = self.dropFirst()
        let less = tail.filter({ $0 < pivot })
        let greater = tail.filter({ $0 >= pivot })
        return less.sortedQS() + [pivot] + greater.sortedQS()
    }
}