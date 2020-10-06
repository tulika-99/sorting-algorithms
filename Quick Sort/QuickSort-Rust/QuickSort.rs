

fn main() {
    let mut int_values_array:[i32; 12] = [1, 0, 9, 8, 100, 345, 5, 6,7 , 4, 3, 2];
    let last_index = int_values_array.len() - 1;
    quick_sort(&mut int_values_array, 0, last_index);
    println!("{:?}", int_values_array)
}

fn exchange(data: &mut [i32], init: usize, to: usize ) {
    let tmp = data[init];
    data[init] = data[to];
    data[to] = tmp;
}

fn validation(data: &mut [i32], start: usize, end: usize ) -> i32 {
    let pivot = data[end];

    let mut index = start;

    let mut i = start;
    while i < end {

        if data[i] < pivot {
            exchange(data, i, index);
            index+=1;
        }

        i+=1;
    }
    exchange(data, index, end);
    return index as i32;
}

fn quick_sort(data: &mut [i32], start: usize, end: usize) {
    if start >= end {
        return;
    }
    let pivot = validation(data, start, end);
    println!("=={}", pivot);

    quick_sort(data, start, (pivot - 1) as usize);
    quick_sort(data, (pivot + 1) as usize, end);
}