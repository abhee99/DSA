╨╧рб▒с                >  ■ 	               '          )      ■       &                                                                                                                                                                                                                                                                                                                                                                                                                                                   ье┴       Ё┐          ╠   dddd                            Sx  Sx  ц                                                                       l     в       в                                   в                                              ╢      ┬              я   Є                                                                                                                           с             ┌                                                                                                                                                                                                                                                                                                                                                                                                                                      ╬                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i m p o r t   j a v a . i o . * ;  i m p o r t   j a v a . l a n g . * ;  i m p o r t   j a v a . u t i l . * ;   c l a s s   I t e m   {          i n t   v a l u e ,   w e i g h t ;          I t e m ( i n t   x ,   i n t   y ) {                  t h i s . v a l u e   =   x ;                  t h i s . w e i g h t   =   y ;          }  }   c l a s s   G f G   {                   p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   I O E x c e p t i o n {                  B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( S y s t e m . i n ) ) ;  	 	 i n t   t   =   I n t e g e r . p a r s e I n t ( b r . r e a d L i n e ( ) . t r i m ( ) ) ;  	 	 w h i l e ( t - - > 0 ) {                          S t r i n g   i n p u t L i n e [ ]   =   b r . r e a d L i n e ( ) . t r i m ( ) . s p l i t ( "   " ) ;                          i n t   n   =   I n t e g e r . p a r s e I n t ( i n p u t L i n e [ 0 ] ) ;                          i n t   w   =   I n t e g e r . p a r s e I n t ( i n p u t L i n e [ 1 ] ) ;                          I t e m [ ]   a r r   =   n e w   I t e m [ n ] ;                          i n p u t L i n e   =   b r . r e a d L i n e ( ) . t r i m ( ) . s p l i t ( "   " ) ;                          f o r ( i n t   i = 0 ,   k = 0 ;   i < n ;   i + + ) {                                  a r r [ i ]   =   n e w   I t e m ( I n t e g e r . p a r s e I n t ( i n p u t L i n e [ k + + ] ) ,   I n t e g e r . p a r s e I n t ( i n p u t L i n e [ k + + ] ) ) ;                          }                          S y s t e m . o u t . p r i n t l n ( S t r i n g . f o r m a t ( " % . 2 f " ,   n e w   S o l u t i o n ( ) . f r a c t i o n a l K n a p s a c k ( w ,   a r r ,   n ) ) ) ;                  }          }  }  / /   }   D r i v e r   C o d e   E n d s    / *  c l a s s   I t e m   {          i n t   v a l u e ,   w e i g h t ;          I t e m ( i n t   x ,   i n t   y ) {                  t h i s . v a l u e   =   x ;                  t h i s . w e i g h t   =   y ;          }  }  * /  / /   M y   c o d e   s t a r t s  c l a s s   M y C o m p a r a t o r   i m p l e m e n t s   C o m p a r a t o r < I t e m >   {          @ O v e r r i d e          p u b l i c   i n t   c o m p a r e ( I t e m   a ,   I t e m   b )   {                  d o u b l e   a _   =   ( d o u b l e )   a . v a l u e / a . w e i g h t ;                  d o u b l e   b _   =   ( d o u b l e )   b . v a l u e / b . w e i g h t ;                   i f ( a _ > b _ )   {                          r e t u r n   - 1 ;                  }                  i f ( a _ < b _ )   {                          r e t u r n   1 ;                  }                  r e t u r n   1 ;          }  }   c l a s s   S o l u t i o n  {          / / F u n c t i o n   t o   g e t   t h e   m a x i m u m   t o t a l   v a l u e   i n   t h e   k n a p s a c k .          d o u b l e   f r a c t i o n a l K n a p s a c k ( i n t   W ,   I t e m   a r r [ ] ,   i n t   n )            {                  d o u b l e   r e s u l t   =   0 . 0 ;                  A r r a y s . s o r t ( a r r ,   n e w   M y C o m p a r a t o r ( ) ) ;                                   f o r ( I t e m   a : a r r )   {                          i f ( W > = a . w e i g h t )   {                                  W - = a . w e i g h t ;                                  r e s u l t + = a . v a l u e ;                            }                          e l s e   {                                  r e s u l t + = W * ( ( d o u b l e ) a . v a l u e / a . w e i g h t ) ;                                    W = 0 ;                          }                          i f ( W = = 0 )   {                                  b r e a k ;                          }                  }                  r e t u r n   r e s u l t ;                           }  }                                                         ╠  ∙                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         OJ QJ CJ    ╠  щ                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ╞& ╨аp@р░АP Ё└!                ╠                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
  i      4  @ё  4    N o r m a l       CJ OJ PJ QJ mH	                  < A@Є б <    D e f a u l t   P a r a g r a p h   F o n t                 ц                 ╠        ╠        ╠            ц            GР                                    T i m e s   N e w   R o m a n   5Р                                   S y m b o l   3Р                                    A r i a l   ;Р                                    H e l v e t i c a      0И Ё╨  h    ┌Kl&┌Kl&                                              Ё                                                                                                                                                                                                                                                                                                                         е└┤ ┤ А 0                                                                                     "         Ё                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ■   
                    рЕЯЄ∙OhлС +'│┘0                  щ¤                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ■   
                    ╒═╒Ь.УЧ +,∙о0                  щ¤                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  	   
            ■                        ■                        ■          !   "   #   $   %   ■   ■   (   ■   ■   ■                                                                                                                                                                                                                                                                                                                                                       R o o t   E n t r y                                                         	     └      F                    *   А       1 T a b l e                                                                                                                 W o r d D o c u m e n t                                                                                                     S u m m a r y I n f o r m a t i o n                           (                                                          D o c u m e n t S u m m a r y I n f o r m a t i o n           8                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           