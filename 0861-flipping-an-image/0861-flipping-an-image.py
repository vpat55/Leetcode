class Solution(object):
    def flipAndInvertImage(self, image):
        return[[0 if x == 1 else 1 for x in x][::-1] for x in image] 
        