def solution(order):
    return sum(1 for char in str(order) if char in '369')