单一职责原则：不要存在多于一个导致类变更的原因

一个类/接口/方法负责一项职责

优点：降低类的复杂度、提高类的可读性，提供系统的可维护性，降低变更风险


开闭原则：一个软件实体如类，模块和函数应该对扩展开放，对修改关闭

优点：提高系统的可复用性和可维护性

里氏代换原则：任何基类出现的地方，子类都可以可以出现。程序中使用基类类型对象进行定义，调用时传入子类

依赖倒置原则：高层模块不应该依赖低层模块，二者应该依赖其抽象

抽象不应该依赖细节，细节应该依赖抽象，针对接口编程，不要针对实现编程

优点：可以减少类件的耦合性，提高系统稳定性，提高带啊吗可读性和可维护性，可减低修改程序所造成的风险

接口隔离原则：
客户端不应该依赖那些它不需要的接口

使用多个隔离的接口，比使用单个接口要好，降低类之间的耦合度

迪米特法则：
最少知道原则，一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立

类之间的耦合度越低，就越有利于复用，一个处在松耦合中的类一旦被修改，不会对关联的类造成太大波及

通过引入一个合理的第三者来降低现有对象之间的耦合度


