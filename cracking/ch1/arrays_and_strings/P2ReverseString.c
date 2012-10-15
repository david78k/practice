#include <stdio.h>

int main(int argc, char **argv) {
	char *str = "abcd";
	char *tmp = str;
	
	while(*tmp) {
		printf("%c", *tmp);
		tmp++;
	}		
	printf("\n");

	while(*(--tmp)) 
		printf("%c", *tmp);
	printf("\n");
}
