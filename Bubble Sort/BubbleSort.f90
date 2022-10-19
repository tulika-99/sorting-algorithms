module sorting

contains

subroutine bubblesort(td,A,n)
   integer, intent(in) :: td
   integer, intent(in out), dimension(td) :: A
   integer, intent(in) :: n
   integer :: i, j, temp
   logical :: swapped

   do j = n-1, 1, -1
      swapped = .false.
      do i = 1, j
         if (A(i) > A(i+1)) then
            temp = A(i)
            A(i) = A(i+1)
            A(i+1) = temp
            swapped = .true.
         end if
      end do
      if (.not. swapped) exit
   end do
end subroutine bubblesort

end module sorting
