### 此文件夹中的内容是有关于TGD的测试用例

- test1:2023.12 编写的基本的TGD的测试用例(限制：①对于任何一个bodyAtom，其内部的 variable都不能重复出现，否则无法处理；②对于任何一个headAtom，其内部的 variable都不能重复出现，否则运行的结果与预期不一致)

  无法处理：

  - ① R(x0,x1,x0) -> P(x0,z)
  - ② R(x,y,z) -> R(a,a,x)

- test2：用来测试为了处理上述无法处理的第①种形式添加逻辑后的代码  

- test3：用来测试为了处理上述无法处理的第②种形式添加逻辑后的代码