import re
class Solution(object):
    def validateCoupons(self, code, businessLine, isActive):
        
#         if code[i] == "":
#              invalid = True
#         else:
#               for ch in code[i]:
#               if not (ch.isalnum() or ch == '_'):
#                   invalid = True
#                   break


        validcode = []
        validbuisnessline =[]
        
        for i in range(0, len(code)):

            invalid = False
            if (
                code[i] == "" or
                re.search(r'[^a-zA-Z0-9_]', code[i]) or
                businessLine[i] not in ["electronics", "grocery", "pharmacy", "restaurant"] or
                isActive[i] != True
            ):
                invalid = True
            
            if not invalid:
                validcode.append(code[i])
                validbuisnessline.append(businessLine[i])
            
        order = ["electronics", "grocery", "pharmacy", "restaurant"]
        result = []

        for bl in order:
            temp = []
            for i in range(len(validcode)):
                if validbuisnessline[i] == bl:
                    temp.append(validcode[i])

            temp.sort()
            result.extend(temp)

        return result