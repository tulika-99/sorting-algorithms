const bucketSort = (arr) => {
    const n = arr.length;
    let buckets = [];
    for (let i = 0; i < n; i++)
        buckets.push([]);
    arr.forEach(item => {
        buckets[Math.floor(item*n)].push(item);
    });
    buckets.forEach(bucket => {
        bucket.sort();
    });
    let newArr = [];
    buckets.forEach(bucket => {
        newArr = newArr.concat(bucket);
    });
    return newArr;
}