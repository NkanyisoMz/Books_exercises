def bubble_sort(arr)
    n = arr.length
    swapped = true
    
    while swapped do
        swapped = false
        (n - 1).times do |i|
            if arr[i] > arr[i + 1]
                arr[i], arr[i + 1] = arr[i + 1], arr[i] # Swap elements
                swapped = true
            end
        end
    end
    
    return arr
end

# Example usage:
arr = [64, 34, 25, 12, 22, 11, 90]
puts bubble_sort(arr).inspect  # Output: [11, 12, 22, 25, 34, 64, 90]
