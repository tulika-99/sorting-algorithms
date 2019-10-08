my @sortArray = ( 5, 6, 3, 1, 7, 3, 2, 9, 10, 4 );

for my $i ( reverse 1 .. $#sortArray ) {
    for my $k ( 0 .. $i - 1 ) {
        @sortArray[ $k, $k + 1 ] = @sortArray[ $k + 1, $k ]
            if $sortArray[$k] > $sortArray[ $k + 1 ];
    }
}
print "@sortArray\n";