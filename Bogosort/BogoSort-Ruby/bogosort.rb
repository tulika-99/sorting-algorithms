def bogosort(array)
  array.shuffle! until sorted?(array)

  array
end

def sorted?(array)
  array == array.sort
end