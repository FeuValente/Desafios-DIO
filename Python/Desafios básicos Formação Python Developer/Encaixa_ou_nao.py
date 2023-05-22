def encaixa(A, B):
    if len(B) > len(A):
        return False
    
    start_index = len(A) - len(B)
    if A[start_index:] == B:
        return True
    else:
        return False

# Leitura do número de casos de teste
N = int(input())

for _ in range(N):
    # Leitura dos valores A e B
    A, B = input().split()
    
    if encaixa(A, B):
        print("encaixa")
    else:
        print("nao encaixa")