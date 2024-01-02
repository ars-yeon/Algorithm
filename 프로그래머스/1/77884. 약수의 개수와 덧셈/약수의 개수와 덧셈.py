def solution(left, right):
    a = [x ** 2 for x in range(1, 33)]
    result = 0
    for i in range(left, right+1):
        result -= (i if i in a else -i)
    return result