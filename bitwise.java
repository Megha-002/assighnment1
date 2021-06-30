

#include <iostream>
using namespace std;

bool isEven(int n)
{

	// n^1 is n+1, then even, else odd
	if (n ^ 1 == n + 1)
		return true;
	else
		return false;
}

int main()
{
	int n = 100;
	isEven(n)
? cout << "Even"
: cout << "Odd";

	return 0;
}
