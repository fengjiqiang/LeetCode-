给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

思路：

从后往前填充即可

注意

先当两个数组都有元素的时候填充大的到末尾，如果有一个数组的数用完了，说明剩下的那个数组的所有数都小于当前填充的位置：

如果是第一个数组用完了，说明剩下的(最小的那些)全是数组2，把数组2填充进去就好了

如果是第二个数组用完了，说明剩下的全是数组1，不用填充了，他们已经在了
