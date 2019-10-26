# bubbleSort.asm

# SETUP  
.data
#set the size and content of array
#Sz: .word 50
Sz: .word 100
Array: 7, 5, 4, 1, 6, 8, 3, 2, 9, 0, 8, 3, 2, 4, 9, 0, 6, 7, 5, 1, 1, 6, 5, 7, 4, 8, 2, 3, 9, 0, 2, 8, 5, 1, 3, 9, 6, 0, 7, 4, 5, 8, 1, 6, 0, 7, 9, 2, 3, 4, 7, 9, 0, 2, 5, 1, 8, 6, 3, 4, 2, 8, 4, 5, 0, 7, 3, 9, 6, 1, 2, 0, 3, 6, 5, 4, 7, 9, 1, 8, 5, 6, 8, 1, 3, 2, 0, 9, 7, 4, 9, 3, 2, 1, 7, 5, 6, 8, 0, 4

NL: .asciiz "\n"
.text
# Initialize List
main:
	lw $s7, Sz # get size of list
	move $s1, $zero  # set counter for # of elems printed
	move $s2, $zero  # set offset from Array
	
#program in C:
#	for (int k = 1; k < size; k++){
#		for (int i = 0; i <size - k; i++){
#			if (a[i] > a[i +1]){
#				int temp = a[i];
#				a[i + 1] = temp;				
#			} 
#		}
#	}

#Variable meanings:
#t0; k
#t1: i
#t2: a[i]
#t3: a[i+1]
#t4: size - k
#t5: temp
#s3: [i+1]

# sort the list:
outer_loop:
	beq $t0, $s7, end_of_sort			#end loop if counter reached size of array
	addi $t1, $zero, 0				#reset inner loop counter
	inner_loop:
		sub $t4, $s7, $t0			#store the values of size - k for comparison later
		beq $t1, $t4, end_of_inner_loop		#end inner loop if counter reached comparitor values
		mul $s2, $t1, 4
		lw $t2, Array($s2)			#load a[i]
		addi $s3, $s2, 4
		lw $t3, Array($s3)			#load a[i+1]
		
		ble $t2, $t3, after_swap
		
			move $t5, $t2			#store a[i] in temp
			move $t2, $t3			#swap
			move $t3, $t5
			
			sw $t2, Array($s2)
			sw $t3, Array($s3)
		after_swap:
		
		addi $t1, $t1, 1			#increment inner counter
		j inner_loop				#jump to start of inner

	end_of_inner_loop:
	addi $t0, $t0, 1				#increment outer counter
	j outer_loop					#jump to start of outer
	
end_of_sort:
# main print loop
move $s1, $zero  # set counter for # of elems printed
move $s2, $zero  # set offset from Array

print_loop:
	bge $s1, $s7, print_loop_end # stop after last elem is printed
	lw $a0, Array($s2)  # print next value from the list
	li $v0, 1
	syscall
	la $a0, NL # print a newline
	li $v0, 4
	syscall
	addi $s1, $s1, 1  # increment the loop counter
	addi $s2, $s2, 4  # step to the next array elem

	j print_loop # repeat the loop
print_loop_end:
