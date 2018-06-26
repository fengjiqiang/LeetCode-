https://leetcode-cn.com/problems/valid-anagram/description/

给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

字符串只包含小写字符，总共有 26 个小写字符。

可以用 HashMap 来映射字符与出现次数。因为键的范围很小，因此可以使用长度为 26 的整型数组对字符串出现的字符进行统计，然后比较两个字符串出现的字符数量是否相同。
