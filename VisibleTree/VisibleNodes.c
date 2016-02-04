#include<stdio.h>
#include<stdlib.h>

struct tree
{
	int x;
	struct tree *l;
	struct tree *r;
};

int findNodes(struct tree* root, int rootVal, int num)
{
	if(root->x >= rootVal)
	{
		num +=1;
	}
	
	//BASE CASE 
	if(root->l == NULL && root->r == NULL)
	{
		return num;
	}
	
	if(root->l != NULL && root->r != NULL)
	{
		return findNodes(root->l,rootVal,num) + findNodes(root->r, rootVal,num) -1;
	}
	if(root->l != NULL && root->r == NULL)
	{
		return findNodes(root->l,rootVal,num);
	}
	if(root->l == NULL && root->r !=NULL)
	{
		return findNodes(root->r,rootVal,num);
	}
	
}

int solution(struct tree * root)
{
	return findNodes(root,root->x, 0);
}

int main(void)
{
	struct tree *root = (struct tree*)malloc (sizeof(struct tree));
	struct tree *node1 = (struct tree*)malloc (sizeof(struct tree));
	struct tree *node2 = (struct tree*)malloc (sizeof(struct tree));
	struct tree *node3 = (struct tree*)malloc (sizeof(struct tree));
	struct tree *node4 = (struct tree*)malloc (sizeof(struct tree));
	struct tree *node5 = (struct tree*)malloc (sizeof(struct tree));
	
	root->x = 5;
	root->l = node1;
	root->r = node2;
	
	node1->x = 3;
	node2->x = 10;
	
	node1->l=node3;
	node1->r = node4;
	node3->x = 20;
	node4->x = 21;
	
	node2->l = node5;
	node5->x = 1;
	
	printf("The number of visible nodes are: %d\n",solution(root));
	
	return 0;
}


	
