#### 1.适配器模式的优缺点  
    适配器模式的优点：更好的复用性，如果功能已经有了，只是接口不兼容，那么通过适配器模式就可以让这些功能得到更好的复用
    更好的可扩展性，在实现适配器功能的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
    适配器模式的缺点：如果过多地使用适配器，会让系统非常凌乱，不容易整体进行把握，因此如果不是很有必要，可以不适用适配  
    器，而是直接对系统进行重构  
#### 2.适配器模式的本质    
    转换匹配，复用功能
#### 3.何时选用适配器模式    
    如果我想要使用一个已经存在的类，但是它的接口不符合你的需求，这种情况可以使用适配器模式，来把已有的实现转换成你需要  
    的接口