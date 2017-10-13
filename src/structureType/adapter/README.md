## 意图
> 讲一个接口转换成用户期望的另一个接口,适配器可以让不兼容的接口在一起工作

## 解释说明

### 真实世界的例子

> 假设在你想将存储卡里有一些图片传输到电脑上.为了传输它们,你需要y一个与计算机端口
兼容的适配器,以便你讲存储卡链接到电脑上.在这种情况下读卡器就是一个adapter.另一个
例子就是著名的电源适配器,一个三角插头不能链接到一个两孔插座上,它需要使用一个插排使两者
兼容.另一个例子是翻译者将一个人的话翻译成另一个人听懂的语言.

### 简单来说

> 适配器模式可以将与其他不兼容的对象包装成与另一个兼容

### 维基百科

> 在软件工程中,适配器模式是一种软件设计模式,允许将现有类的接口作用到另一个接口.

## 具体代码编写

假设一个只能使用划艇的船长并且不能航行

首先我们有RowingBoat接口 和 FishingBoat对象,并且c船长预计实现RowingBoat接口去进行移动.
此时发现海盗正在追过来,我们的船长需要逃跑但是只有FishingBoat(渔船).
我们需要创建一个适配器允许船长用RowingBoat的技术操作FishingBoat.


具体代码见 structureType/adapter