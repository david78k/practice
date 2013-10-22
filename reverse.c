#include <stdio.h>

void reverse(char *); 

int main(int argc, char **argv) {
	char *str = "abcd";
	reverse(str);
	printf("reversed string = %s\n", str);
}

void reverse (char * str) {
	if (str == NULL) return;

	char *end = str;

	while(*end) {
		printf("%c", *end);
		end++;
	}		
	printf("\n");
	end --;

	char c;
	char *tmp = str;

	while(tmp < end) {
		printf("%c", *end);
		//printf("%c", *str);
		c = *tmp;
		*tmp++ = *end;
		*end-- = c;
	}
	printf("\n");
}
