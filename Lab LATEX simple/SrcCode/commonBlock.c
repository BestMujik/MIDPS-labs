typedef struct {
	float	x		[IZX]	 ;
	float	y		[IZX]	 ;
	float	xp		[IZX]	 ;
	float	yp		[IZX]	 ;
	float	s		[IZX]	 ;
	float	sle			 ;
	float	xle			 ;
	float	yle			 ;
	float	xte			 ;
	float	yte			 ;
	float	chord			 ;
	float	yimage			 ;
	float	wgap	[IWX]	 	 ;
	float	waklen			 ;
} xfoil_cr05;

extern "C" {
extern xfoil_cr05 CR05;
}