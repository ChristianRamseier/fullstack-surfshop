import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'windDirection'
})
export class WindDirectionPipe implements PipeTransform {

  transform(value: string, ...args: any[]): unknown {
    if (!value) {
      return '';
    }
    return value.toLocaleLowerCase().split('').map(s => {
      switch (s) {
        case 's': return 'south';
        case 'w': return 'west';
        case 'n': return 'north';
        case 'e': return 'east';
        default: throw Error(`Unknown direction ${s}`)
      }
    }).join(' ');
  }

}
